diff --git a/jnalib/test/com/sun/jna/StructureTest.java b/jnalib/test/com/sun/jna/StructureTest.java
index 84d7c4d..5078551 100644
--- a/jnalib/test/com/sun/jna/StructureTest.java
+++ b/jnalib/test/com/sun/jna/StructureTest.java
@@ -1233,7 +1233,7 @@
         }
         Memory p = new Memory(256);
         Structure s = new TestStructure(p);
-        assertEquals("Wrong structure size", p.getSize(), s.size());
+        assertEquals("Wrong structure size", p.size(), s.size());
     }
 
 }
