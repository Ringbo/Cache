diff --git a/src/org/geometerplus/fbreader/book/XMLSerializer.java b/src/org/geometerplus/fbreader/book/XMLSerializer.java
index a8484df..f8ae500 100644
--- a/src/org/geometerplus/fbreader/book/XMLSerializer.java
+++ b/src/org/geometerplus/fbreader/book/XMLSerializer.java
@@ -496,7 +496,7 @@
 				myBook.addLabelWithNoCheck(label);
 			}
 			for (UID uid : myUidList) {
-				myBook.addUid(uid);
+				myBook.addUidWithNoCheck(uid);
 			}
 			myBook.setSeriesInfoWithNoCheck(string(mySeriesTitle), string(mySeriesIndex));
 			myBook.HasBookmark = myHasBookmark;
