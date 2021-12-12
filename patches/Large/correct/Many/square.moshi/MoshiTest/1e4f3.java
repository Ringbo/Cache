diff --git a/moshi/src/test/java/com/squareup/moshi/MoshiTest.java b/moshi/src/test/java/com/squareup/moshi/MoshiTest.java
index c8e2c39..77c7bd3 100644
--- a/moshi/src/test/java/com/squareup/moshi/MoshiTest.java
+++ b/moshi/src/test/java/com/squareup/moshi/MoshiTest.java
@@ -269,8 +269,7 @@
     try {
       adapter.fromJson(reader);
       fail();
-    } catch (IOException expected) {
-      // TODO: should this really be NumberFormatException?
+    } catch (NumberFormatException expected) {
       assertThat(expected.getMessage()).isEqualTo("JSON forbids NaN and infinities: Infinity at path $[0]");
     }
 
@@ -279,8 +278,7 @@
     try {
       adapter.fromJson(reader);
       fail();
-    } catch (IOException expected) {
-      // TODO: should this really be NumberFormatException?
+    } catch (NumberFormatException expected) {
       assertThat(expected.getMessage()).isEqualTo("JSON forbids NaN and infinities: -Infinity at path $[0]");
     }
   }
@@ -339,8 +337,7 @@
     try {
       adapter.fromJson(reader);
       fail();
-    } catch (IOException expected) {
-      // TODO: should this really be NumberFormatException?
+    } catch (NumberFormatException expected) {
       assertThat(expected.getMessage()).isEqualTo("JSON forbids NaN and infinities: Infinity at path $[1]");
     }
 
@@ -349,8 +346,7 @@
     try {
       adapter.fromJson(reader);
       fail();
-    } catch (IOException expected) {
-      // TODO: should this really be NumberFormatException?
+    } catch (NumberFormatException expected) {
       assertThat(expected.getMessage()).isEqualTo("JSON forbids NaN and infinities: -Infinity at path $[1]");
     }
   }
