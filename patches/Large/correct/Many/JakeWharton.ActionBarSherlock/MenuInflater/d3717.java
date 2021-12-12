diff --git a/library/src/android/support/v4/view/MenuInflater.java b/library/src/android/support/v4/view/MenuInflater.java
index 8b8608c..31dd90a 100644
--- a/library/src/android/support/v4/view/MenuInflater.java
+++ b/library/src/android/support/v4/view/MenuInflater.java
@@ -401,7 +401,7 @@
 				} catch (Exception e) {
 					throw new InflateException(e);
 				}
-			} else if (itemActionLayout >= 0) {
+			} else if (itemActionLayout > 0) {
 				item.setActionView(itemActionLayout);
 			}
 		}
