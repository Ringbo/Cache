diff --git a/retrofit-converters/wire/src/test/java/retrofit/converter/WireConverterTest.java b/retrofit-converters/wire/src/test/java/retrofit/converter/WireConverterTest.java
index 6756dd8..fd30344 100644
--- a/retrofit-converters/wire/src/test/java/retrofit/converter/WireConverterTest.java
+++ b/retrofit-converters/wire/src/test/java/retrofit/converter/WireConverterTest.java
@@ -64,7 +64,7 @@
     try {
       converter.fromBody(decodeBase64("////", "yummy/bytes"), Person.class);
       fail();
-    } catch (IllegalArgumentException e) {
+    } catch (ConversionException e) {
       assertThat(e).hasMessage("Expected a proto but was: yummy/bytes");
     }
   }
