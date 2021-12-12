diff --git a/drools-verifier/src/main/java/org/drools/verifier/components/LiteralRestriction.java b/drools-verifier/src/main/java/org/drools/verifier/components/LiteralRestriction.java
index 2da14e5..16713fb 100644
--- a/drools-verifier/src/main/java/org/drools/verifier/components/LiteralRestriction.java
+++ b/drools-verifier/src/main/java/org/drools/verifier/components/LiteralRestriction.java
@@ -40,7 +40,7 @@
     public static LiteralRestriction createRestriction(Pattern pattern,
                                                        String value) {
 
-        if ( value == null ) {
+        if ( "null".equals(value) || value == null ) {
             return new StringRestriction( pattern );
         }
 
