diff --git a/k9mail/src/main/java/com/fsck/k9/preferences/TimePickerPreference.java b/k9mail/src/main/java/com/fsck/k9/preferences/TimePickerPreference.java
index 2675292..24e418f 100644
--- a/k9mail/src/main/java/com/fsck/k9/preferences/TimePickerPreference.java
+++ b/k9mail/src/main/java/com/fsck/k9/preferences/TimePickerPreference.java
@@ -145,7 +145,7 @@
             return -1;
         }
 
-        return Integer.valueOf(time.split(":")[0]);
+        return Integer.parseInt(time.split(":")[0]);
     }
 
     /**
@@ -159,7 +159,7 @@
             return -1;
         }
 
-        return Integer.valueOf(time.split(":")[1]);
+        return Integer.parseInt(time.split(":")[1]);
     }
 
     /**
