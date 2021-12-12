diff --git a/library/src/main/java/com/loopj/android/http/PersistentCookieStore.java b/library/src/main/java/com/loopj/android/http/PersistentCookieStore.java
index b3419ea..b290746 100755
--- a/library/src/main/java/com/loopj/android/http/PersistentCookieStore.java
+++ b/library/src/main/java/com/loopj/android/http/PersistentCookieStore.java
@@ -97,7 +97,7 @@
         SharedPreferences.Editor prefsWriter = cookiePrefs.edit();
         prefsWriter.putString(COOKIE_NAME_STORE, TextUtils.join(",", cookies.keySet()));
         prefsWriter.putString(COOKIE_NAME_PREFIX + name, encodeCookie(new SerializableCookie(cookie)));
-        prefsWriter.commit();
+        prefsWriter.apply();
     }
 
     @Override
@@ -108,7 +108,7 @@
             prefsWriter.remove(COOKIE_NAME_PREFIX + name);
         }
         prefsWriter.remove(COOKIE_NAME_STORE);
-        prefsWriter.commit();
+        prefsWriter.apply();
 
         // Clear cookies from local store
         cookies.clear();
@@ -138,7 +138,7 @@
         if (clearedAny) {
             prefsWriter.putString(COOKIE_NAME_STORE, TextUtils.join(",", cookies.keySet()));
         }
-        prefsWriter.commit();
+        prefsWriter.apply();
 
         return clearedAny;
     }
@@ -168,7 +168,7 @@
         cookies.remove(name);
         SharedPreferences.Editor prefsWriter = cookiePrefs.edit();
         prefsWriter.remove(COOKIE_NAME_PREFIX + name);
-        prefsWriter.commit();
+        prefsWriter.apply();
     }
 
     /**
