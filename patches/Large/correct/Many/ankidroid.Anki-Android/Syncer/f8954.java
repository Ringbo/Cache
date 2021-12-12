diff --git a/src/com/ichi2/libanki/sync/Syncer.java b/src/com/ichi2/libanki/sync/Syncer.java
index 27c5574..deab0fd 100644
--- a/src/com/ichi2/libanki/sync/Syncer.java
+++ b/src/com/ichi2/libanki/sync/Syncer.java
@@ -225,7 +225,7 @@
 
     	    	mCol.getDb().getDatabase().setTransactionSuccessful();
         	} finally {
-    	    	mCol.getDb().getDatabase().setTransactionSuccessful();	
+    	    	mCol.getDb().getDatabase().endTransaction();	
     		}
 		} catch (JSONException e) {
 			throw new RuntimeException(e);
