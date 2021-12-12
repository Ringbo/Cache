diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberFormatSample.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberFormatSample.java
index d123739..fdaf442 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberFormatSample.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/data/formatters/NumberFormatSample.java
@@ -41,7 +41,7 @@
         props.put(PROP_USE_GROUPING, tmp.isGroupingUsed());
         props.put(PROP_MAX_INT_DIGITS, tmp.getMaximumIntegerDigits());
         props.put(PROP_MIN_INT_DIGITS, tmp.getMinimumIntegerDigits());
-        props.put(PROP_MAX_FRACT_DIGITS, Math.max(tmp.getMaximumFractionDigits(), 6));
+        props.put(PROP_MAX_FRACT_DIGITS, Math.max(tmp.getMaximumFractionDigits(), 10));
         props.put(PROP_MIN_FRACT_DIGITS, tmp.getMinimumFractionDigits());
         props.put(PROP_ROUNDING_MODE, tmp.getRoundingMode().name());
         return props;
