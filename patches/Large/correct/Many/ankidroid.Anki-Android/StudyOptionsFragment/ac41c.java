diff --git a/src/com/ichi2/anki/StudyOptionsFragment.java b/src/com/ichi2/anki/StudyOptionsFragment.java
index 7ee02a8..909b4eb 100644
--- a/src/com/ichi2/anki/StudyOptionsFragment.java
+++ b/src/com/ichi2/anki/StudyOptionsFragment.java
@@ -911,7 +911,8 @@
 			case Reviewer.RESULT_SESSION_COMPLETED:
 			default:
 				// do not reload counts, if activity is created anew because it has been before destroyed by android
-				setStudyOptionsView(true);
+				resetAndUpdateValuesFromDeck();				
+//				setStudyOptionsView(true);
 				break;
 			case Reviewer.RESULT_NO_MORE_CARDS:
 				setCongratsView();
