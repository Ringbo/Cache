diff --git a/src/main/java/org/mapdb/volume/Volume.java b/src/main/java/org/mapdb/volume/Volume.java
index b8d4256..1e5e22b 100644
--- a/src/main/java/org/mapdb/volume/Volume.java
+++ b/src/main/java/org/mapdb/volume/Volume.java
@@ -58,7 +58,7 @@
                 return i;
             }
         }
-        throw new AssertionError("Could not find sliceShift");
+        throw new IllegalStateException("Could not find sliceShift");
     }
 
     static boolean isEmptyFile(String fileName) {
@@ -333,7 +333,7 @@
         try {
             getDataInput(inputOffset, (int) size).readFully(data);
         }catch(IOException e){
-            throw new DBException.VolumeIOError(e);
+            throw new DBException.VolumeIOException(e);
         }
         target.putData(targetOffset,data,0, (int) size);
     }
@@ -406,7 +406,7 @@
                 offset+=read;
             }
         } catch (IOException e) {
-            throw new IOError(e);
+            throw new DBException.VolumeIOException(e);
         }
     }
 
@@ -427,7 +427,7 @@
             try {
                 output.write(buf, 0, size);
             } catch (IOException e) {
-                throw new IOError(e);
+                throw new DBException.VolumeIOException(e);
             }
         }
     }
@@ -495,7 +495,7 @@
                     throw new DBException.FileLocked(file.toPath(), e);
                 }
             } catch (IOException e) {
-                throw new DBException.VolumeIOError(e);
+                throw new DBException.VolumeIOException(e);
             }
 
             if (fileLockWait <= 0) {
