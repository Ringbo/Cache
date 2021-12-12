diff --git a/lvcs/impl/src/com/intellij/history/core/storage/ContentStorage.java b/lvcs/impl/src/com/intellij/history/core/storage/ContentStorage.java
index 2098419..9a4e27d 100644
--- a/lvcs/impl/src/com/intellij/history/core/storage/ContentStorage.java
+++ b/lvcs/impl/src/com/intellij/history/core/storage/ContentStorage.java
@@ -39,7 +39,7 @@
       r.close();
       return r.getRecordId();
     }
-    catch (Exception e) {
+    catch (Throwable e) {
       throw new BrokenStorageException(e);
     }
   }
@@ -52,7 +52,7 @@
       r.close();
       return buffer;
     }
-    catch (Exception e) {
+    catch (Throwable e) {
       throw new BrokenStorageException(e);
     }
   }
