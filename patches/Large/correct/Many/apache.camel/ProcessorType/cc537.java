diff --git a/camel-core/src/main/java/org/apache/camel/model/ProcessorType.java b/camel-core/src/main/java/org/apache/camel/model/ProcessorType.java
index 8bbf017..1266159 100644
--- a/camel-core/src/main/java/org/apache/camel/model/ProcessorType.java
+++ b/camel-core/src/main/java/org/apache/camel/model/ProcessorType.java
@@ -1663,7 +1663,7 @@
      * @return the builder
      */
     public Type setExchangePattern(ExchangePattern exchangePattern) {
-        addOutput(new ExchangePatternType(exchangePattern));
+        addOutput(new SetExchangePatternType(exchangePattern));
         return (Type) this;
     }
     
