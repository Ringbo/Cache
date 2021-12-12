diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 8f7165c..6218238 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -2625,7 +2625,7 @@
     		       		executeCommand(mGestureTapLeft);
     				}    				
     			}
- 			} else if(mClipboard.getText().length() != 0){
+ 			} else if(mClipboard != null && mClipboard.getText() != null && mClipboard.getText().length() != 0){
  				mIsSelecting = false;
  			}
     		return false;
