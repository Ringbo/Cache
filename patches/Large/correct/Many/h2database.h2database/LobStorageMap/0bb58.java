diff --git a/h2/src/main/org/h2/store/LobStorageMap.java b/h2/src/main/org/h2/store/LobStorageMap.java
index 3fc3f73..d17e70d 100644
--- a/h2/src/main/org/h2/store/LobStorageMap.java
+++ b/h2/src/main/org/h2/store/LobStorageMap.java
@@ -125,7 +125,7 @@
             }
             return createLob(in, type);
         } catch (IllegalStateException e) {
-            throw DbException.get(ErrorCode.OBJECT_CLOSED);
+            throw DbException.get(ErrorCode.OBJECT_CLOSED, e);
         } catch (IOException e) {
             throw DbException.convertIOException(e, null);
         }
@@ -163,7 +163,7 @@
                     lob.getTableId(), lob.getLobId(), null, in.getLength());
             return lob;
         } catch (IllegalStateException e) {
-            throw DbException.get(ErrorCode.OBJECT_CLOSED);
+            throw DbException.get(ErrorCode.OBJECT_CLOSED, e);
         } catch (IOException e) {
             throw DbException.convertIOException(e, null);
         }
