package edu.gvsu.cis.convcalc.dummy;

import org.joda.time.DateTime;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class HistoryContent {

    public static final List<HistoryItem> ITEMS = new ArrayList<HistoryItem>();

    static {
        DateTime now = DateTime.now();
//        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.minusDays(1)));
//        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.minusDays(1)));
//        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.plusDays(1)));
//        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.plusDays(1)));
    }

    public static void addItem(HistoryItem item) {
        ITEMS.add(item);
    }

    public static class HistoryItem {  // The "POJO"

        DateTime now = DateTime.now();

        public final Double fromVal;
        public final Double toVal;
        public final String mode;
        public final String fromUnits;
        public final String toUnits;
        public final String timestamp;  //        public final DateTime timestamp;
        public String _key;  // used to persist historical entries

        public HistoryItem(Double fromVal, Double toVal, String mode,
                           String fromUnits, String toUnits, String timestamp) {
            this.fromVal = fromVal;
            this.toVal = toVal;
            this.mode = mode;
            this.fromUnits = fromUnits;
            this.toUnits = toUnits;
            this.timestamp = timestamp;

        }

        public HistoryItem() {
            this.fromVal = 1.0;
            this.toVal = 1.829;
            this.mode = "Length";
            this.fromUnits = "Yards";
            this.toUnits = "Meters";
            this.timestamp = now.minusDays(1).toString();  // todo does this work?
        }

        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat("#.###");
            df.setRoundingMode(RoundingMode.CEILING);
            return df.format(this.fromVal) + " " + this.fromUnits + " = " + df.format(this.toVal) + " " + this.toUnits;
        }
    }
}
