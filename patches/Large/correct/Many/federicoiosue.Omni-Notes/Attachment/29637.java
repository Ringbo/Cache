diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/models/Attachment.java b/omniNotes/src/main/java/it/feio/android/omninotes/models/Attachment.java
index 3d1b661..3c872ae 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/models/Attachment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/models/Attachment.java
@@ -60,7 +60,7 @@
 
 	public void setUri(Uri uri) {
 		this.uri = uri;
-		setUriPath(uri.getPath());
+		setUriPath(uri.toString());
 	}
 
 
