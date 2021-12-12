diff --git a/test/com/sun/jna/NativeTest.java b/test/com/sun/jna/NativeTest.java
index 821b0b0..87ecdd2 100644
--- a/test/com/sun/jna/NativeTest.java
+++ b/test/com/sun/jna/NativeTest.java
@@ -337,7 +337,7 @@
             assertEquals("Wrong encoding for direct mapping " + classes[i],
                          encoding, Native.getStringEncoding(classes[i]));
             Object last = Native.getLibraryOptions(classes[i]);;
-            assertSame("Options not cached", last, Native.getStringEncoding(classes[i]));
+            assertSame("Options not cached", last, Native.getLibraryOptions(classes[i]));
         }
     }
 
@@ -380,7 +380,7 @@
             assertEquals("Wrong encoding for direct mapping " + classes[i],
                          DirectMappingStatic.TEST_ENCODING, Native.getStringEncoding(classes[i]));
             Object last = Native.getLibraryOptions(classes[i]);;
-            assertSame("Options not cached", last, Native.getStringEncoding(classes[i]));
+            assertSame("Options not cached", last, Native.getLibraryOptions(classes[i]));
         }
     }
 
