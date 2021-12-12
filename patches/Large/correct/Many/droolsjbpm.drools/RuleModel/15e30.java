diff --git a/drools-compiler/src/main/java/org/drools/guvnor/client/modeldriven/brl/RuleModel.java b/drools-compiler/src/main/java/org/drools/guvnor/client/modeldriven/brl/RuleModel.java
index 4d0c27f..13e25ad 100644
--- a/drools-compiler/src/main/java/org/drools/guvnor/client/modeldriven/brl/RuleModel.java
+++ b/drools-compiler/src/main/java/org/drools/guvnor/client/modeldriven/brl/RuleModel.java
@@ -145,7 +145,7 @@
         if ( f instanceof CompositeFieldConstraint ) {
             CompositeFieldConstraint s = (CompositeFieldConstraint) f;
             for ( FieldConstraint ss : s.constraints ) {
-                List<String> t = giveFieldBinding( s );
+                List<String> t = giveFieldBinding( ss );
                 result.addAll( t );
             }
         }
