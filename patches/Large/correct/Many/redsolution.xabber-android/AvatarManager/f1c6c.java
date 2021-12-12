diff --git a/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java b/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java
index 065be65..78f06c1 100644
--- a/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java
+++ b/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java
@@ -100,7 +100,7 @@
     /**
      * Map with drawable used in contact list only for specified uses.
      */
-    private final Map<UserJid, Drawable> contactListDrawables;
+    private final Map<Jid, Drawable> contactListDrawables;
     /**
      * Users' default avatar set.
      */
@@ -253,7 +253,7 @@
 
     @Nullable
     public String getHash(Jid bareAddress) {
-        return hashes.get(bareAddress.toString());
+        return hashes.get(bareAddress);
     }
 
     /**
@@ -355,10 +355,10 @@
      * @return
      */
     public Drawable getUserAvatarForContactList(UserJid user) {
-        Drawable drawable = contactListDrawables.get(user);
+        Drawable drawable = contactListDrawables.get(user.getJid());
         if (drawable == null) {
             drawable = getUserAvatar(user);
-            contactListDrawables.put(user, drawable);
+            contactListDrawables.put(user.getJid(), drawable);
         }
         return drawable;
     }
@@ -390,10 +390,10 @@
      * @return
      */
     public Drawable getRoomAvatarForContactList(UserJid user) {
-        Drawable drawable = contactListDrawables.get(user);
+        Drawable drawable = contactListDrawables.get(user.getJid());
         if (drawable == null) {
             drawable = getRoomAvatar(user);
-            contactListDrawables.put(user, drawable);
+            contactListDrawables.put(user.getJid(), drawable);
         }
         return drawable;
     }
