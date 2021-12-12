diff --git a/server/src/main/java/org/elasticsearch/search/aggregations/bucket/composite/CompositeValuesSourceBuilder.java b/server/src/main/java/org/elasticsearch/search/aggregations/bucket/composite/CompositeValuesSourceBuilder.java
index cb9c550..32a94f5 100644
--- a/server/src/main/java/org/elasticsearch/search/aggregations/bucket/composite/CompositeValuesSourceBuilder.java
+++ b/server/src/main/java/org/elasticsearch/search/aggregations/bucket/composite/CompositeValuesSourceBuilder.java
@@ -72,8 +72,8 @@
         } else {
             this.missingBucket = false;
         }
-        if (in.getVersion().onOrAfter(Version.V_7_0_0_alpha1)) {
-            // skip missing value
+        if (in.getVersion().before(Version.V_7_0_0_alpha1)) {
+            // skip missing value for BWC
             in.readGenericValue();
         }
         this.order = SortOrder.readFromStream(in);
@@ -98,10 +98,11 @@
         if (hasValueType) {
             valueType.writeTo(out);
         }
-        if (out.getVersion().onOrAfter(Version.V_7_0_0_alpha1)) {
+        if (out.getVersion().onOrAfter(Version.V_6_4_0)) {
             out.writeBoolean(missingBucket);
         }
-        if (out.getVersion().onOrAfter(Version.V_7_0_0_alpha1)) {
+        if (out.getVersion().before(Version.V_7_0_0_alpha1)) {
+            // write missing value for BWC
             out.writeGenericValue(null);
         }
         order.writeTo(out);
