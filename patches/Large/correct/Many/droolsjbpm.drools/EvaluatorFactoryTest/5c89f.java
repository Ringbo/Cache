diff --git a/drools-core/src/test/java/org/drools/base/EvaluatorFactoryTest.java b/drools-core/src/test/java/org/drools/base/EvaluatorFactoryTest.java
index 3dfff3c..6bd5e68 100644
--- a/drools-core/src/test/java/org/drools/base/EvaluatorFactoryTest.java
+++ b/drools-core/src/test/java/org/drools/base/EvaluatorFactoryTest.java
@@ -349,7 +349,7 @@
         Declaration declaration = new Declaration( "test",
                                                    extractor,
                                                    null );
-        if ( valueType.isIntegerNumber() ) {
+        if ( valueType.isIntegerNumber() || valueType.isChar() ) {
             LongVariableContextEntry context = new LongVariableContextEntry( extractor,
                                                                              declaration );
             if ( row[2] instanceof Character ) {
