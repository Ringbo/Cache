diff --git a/drools-core/src/main/java/org/drools/core/util/BinaryRuleBaseLoader.java b/drools-core/src/main/java/org/drools/core/util/BinaryRuleBaseLoader.java
index 1532f27..7006f7b 100644
--- a/drools-core/src/main/java/org/drools/core/util/BinaryRuleBaseLoader.java
+++ b/drools-core/src/main/java/org/drools/core/util/BinaryRuleBaseLoader.java
@@ -62,7 +62,7 @@
         if ( classLoader == null ) {
             classLoader = Thread.currentThread().getContextClassLoader();
             if ( classLoader == null ) {
-                classLoader = this.getClass().getClassLoader();
+                classLoader = Thread.currentThread().getContextClassLoader();
             }
         }
         this.ruleBase = rb;
