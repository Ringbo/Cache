diff --git a/sandbox/repoclean/src/main/java/org/apache/maven/tools/repoclean/translate/PomV3ToV4Translator.java b/sandbox/repoclean/src/main/java/org/apache/maven/tools/repoclean/translate/PomV3ToV4Translator.java
index 4c98db6..95d589c 100644
--- a/sandbox/repoclean/src/main/java/org/apache/maven/tools/repoclean/translate/PomV3ToV4Translator.java
+++ b/sandbox/repoclean/src/main/java/org/apache/maven/tools/repoclean/translate/PomV3ToV4Translator.java
@@ -560,7 +560,7 @@
 
                     if ( !props.isEmpty() )
                     {
-                        for ( Iterator propertyIterator = props.keySet().iterator(); it.hasNext(); )
+                        for ( Iterator propertyIterator = props.keySet().iterator(); propertyIterator.hasNext(); )
                         {
                             String key = (String) propertyIterator.next();
                             String value = props.getProperty( key );
