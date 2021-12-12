diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/StringDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/StringDeserializer.java
index f4dd6dc..6ac230d 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/StringDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/StringDeserializer.java
@@ -9,7 +9,7 @@
 import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
 
 @JacksonStdImpl
-public final class StringDeserializer extends StdScalarDeserializer<String>
+public class StringDeserializer extends StdScalarDeserializer<String> // non-final since 2.9
 {
     private static final long serialVersionUID = 1L;
 
