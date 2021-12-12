diff --git a/xabber/src/main/java/com/xabber/android/data/account/AccountItem.java b/xabber/src/main/java/com/xabber/android/data/account/AccountItem.java
index c8a1b43..c108703 100644
--- a/xabber/src/main/java/com/xabber/android/data/account/AccountItem.java
+++ b/xabber/src/main/java/com/xabber/android/data/account/AccountItem.java
@@ -140,10 +140,10 @@
     }
 
     /**
-     * @return Valid priority value between -128 and 128.
+     * @return Valid priority value between -128 and 127.
      */
     static private int getValidPriority(int priority) {
-        return Math.min(128, Math.max(-128, priority));
+        return Math.min(127, Math.max(-128, priority));
     }
 
     /**
