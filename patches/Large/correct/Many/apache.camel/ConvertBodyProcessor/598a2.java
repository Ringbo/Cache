diff --git a/camel-core/src/main/java/org/apache/camel/processor/ConvertBodyProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/ConvertBodyProcessor.java
index 125e0e6..d42eae4 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/ConvertBodyProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/ConvertBodyProcessor.java
@@ -89,7 +89,7 @@
         Object value;
         try {
             value = old.getMandatoryBody(type);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             exchange.setException(e);
             callback.done(true);
             return true;
