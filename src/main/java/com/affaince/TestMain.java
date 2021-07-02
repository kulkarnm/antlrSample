package com.affaince;

import com.affaince.benefit.BenefitLexer;
import com.affaince.benefit.BenefitParser;
import com.affaince.subscription.metrics.Metric;
import com.affaince.subscription.metrics.SubscriptionMetricsContext;
import com.affaince.vo.AttributeTypes;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Metric> schemeDefinedMetrics = getListOfMetrics();
        SubscriptionMetricsContext subscriptionMetricsContext = new SubscriptionMetricsContext("xyz");
        subscriptionMetricsContext.setMetrics(schemeDefinedMetrics);

        String str = "given\n" +
                "\t $UNIT_SUBSCRIPTION_VALUE = 1000 ;\n" +
                "\t $UNIT_PERIOD_MONTH = 2 ;\n" +
                "\t $VALUE_PER_POINT = 1 ;\n" +
                "\t $SUBSCRIPTION_VALUE as input ;\n" +
                "\t $SUBSCRIPTION_PERIOD as input ;\n" +
                "\t compute \n" +
                "\t $RESULT1= $SUBSCRIPTION_VALUE / $UNIT_SUBSCRIPTION_VALUE ;\n" +
                "\t $RESULT2= $SUBSCRIPTION_PERIOD / $UNIT_PERIOD_MONTH ;\n" +
                "\t $BENEFIT_COUNT = $RESULT1 * $RESULT2 ;\n" +
                "\t $BENEFIT_VALUE = $BENEFIT_COUNT * $VALUE_PER_POINT ;\n" +
                "\t eligibleWhen\n" +
                "\t$SUBSCRIPTION_VALUE > 20000 and\n" +
                "\t$SUBSCRIPTION_VALUE < 30000 and\n" +
                "\t$SUBSCRIPTION_PERIOD >= 10 ;\n" +
                "pay $BENEFIT_VALUE \n" +
                " \tafter 1/4 , 1/2 , 3/4 of $TOTAL_DELIVERIES in default proportion ;";

        ANTLRInputStream input = new ANTLRInputStream(str);
        BenefitLexer lexer = new BenefitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BenefitParser parser = new BenefitParser(tokens);
        ParseTree tree = parser.scheme(); // parse; start at prog System.out.println(tree.toStringTree(parser)); // print tree as text
        System.out.println(tree.getText());
    }

    public static List<Metric> getListOfMetrics() {
        Metric metricSubscriptionValue = new Metric("SUBSCRIPTION_VALUE", "subscriptionValue", AttributeTypes.DOUBLE);
        Metric metricSubscriptionPeriod = new Metric("SUBSCRIPTION_PERIOD", "deliveriesCount", AttributeTypes.INTEGER);
        List<Metric> schemeDefinedMetrics = new ArrayList<>();
        schemeDefinedMetrics.add(metricSubscriptionValue);
        schemeDefinedMetrics.add(metricSubscriptionPeriod);
        return schemeDefinedMetrics;
    }
}
