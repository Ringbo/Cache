diff --git a/drools-core/src/main/java/org/drools/core/factmodel/FieldDefinition.java b/drools-core/src/main/java/org/drools/core/factmodel/FieldDefinition.java
index a4b90a6..0a61240 100755
--- a/drools-core/src/main/java/org/drools/core/factmodel/FieldDefinition.java
+++ b/drools-core/src/main/java/org/drools/core/factmodel/FieldDefinition.java
@@ -382,7 +382,7 @@
         try {
             return initExpr == null ? 0L : Long.parseLong(initExpr);
         } catch (NumberFormatException nfe) {
-            return StringUtils.isEmpty( initExpr ) ? 0 : MVELSafeHelper.getEvaluator().eval( initExpr, Long.class );
+            return StringUtils.isEmpty( initExpr ) ? 0L : MVELSafeHelper.getEvaluator().eval( initExpr, Long.class );
         }
     }
     public Short getDefaultValueAsShort( ) {
