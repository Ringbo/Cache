diff --git a/Java/Ch 10. Sorting and Searching/Q10_03_Search_in_Rotated_Array/Question.java b/Java/Ch 10. Sorting and Searching/Q10_03_Search_in_Rotated_Array/Question.java
index ecd6483..bf7fd82 100644
--- a/Java/Ch 10. Sorting and Searching/Q10_03_Search_in_Rotated_Array/Question.java
+++ b/Java/Ch 10. Sorting and Searching/Q10_03_Search_in_Rotated_Array/Question.java
@@ -26,7 +26,7 @@
 			} else {
 				return search(a, mid + 1, right, x);
 			}
-		} else if (a[mid] < a[left]) { // Right is normally ordered.
+		} else if (a[mid] < a[right]) { // Right is normally ordered.
 			if (x > a[mid] && x <= a[right]) {
 				return search(a, mid + 1, right, x);
 			} else {
