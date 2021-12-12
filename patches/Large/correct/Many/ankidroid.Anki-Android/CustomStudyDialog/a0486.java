diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java b/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java
index 114c24d..ade7351 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java
@@ -173,7 +173,7 @@
                                             sb.append("(").append(TextUtils.join(" or ", arr)).append(")");
                                         }
                                         createCustomStudySession(new JSONArray(), new Object[]{sb.toString(),
-                                                Consts.DYN_MAX_SIZE, Consts.DYN_RANDOM}, false);
+                                                Consts.DYN_MAX_SIZE, Consts.DYN_RANDOM}, true);
                                     }
                                 });
                                 activity.showDialogFragment(dialogFragment);
