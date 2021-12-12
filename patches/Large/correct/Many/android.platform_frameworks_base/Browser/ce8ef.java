diff --git a/core/java/android/provider/Browser.java b/core/java/android/provider/Browser.java
index a5c85c1..4377a2b 100644
--- a/core/java/android/provider/Browser.java
+++ b/core/java/android/provider/Browser.java
@@ -363,7 +363,7 @@
                 str[i] = c.getString(0);
                 i++;
             }
-            c.deactivate();
+            c.close();
             return str;
         } catch (IllegalStateException e) {
             return new String[0];
@@ -402,7 +402,7 @@
                     if (!c.moveToNext()) break;
                 }
             }
-            c.deactivate();
+            c.close();
         } catch (IllegalStateException e) {
             Log.e(LOGTAG, "truncateHistory", e);
             return;
@@ -427,7 +427,7 @@
                 null
                 );
             boolean ret = c.moveToFirst();
-            c.deactivate();
+            c.close();
             return ret;
         } catch (IllegalStateException e) {
             return false;
@@ -462,7 +462,7 @@
                 null,
                 null);
             if (!c.moveToFirst()) {
-                c.deactivate();
+                c.close();
                 return;
             }
 
@@ -489,7 +489,7 @@
                     iconDb.releaseIconForPageUrl(url);
                 }
             } while (c.moveToNext());
-            c.deactivate();
+            c.close();
 
             if (!firstTime) {
                 ContentValues map = new ContentValues();
@@ -576,7 +576,7 @@
             } else {
                 cr.insert(SEARCHES_URI, map);
             }
-            c.deactivate();
+            c.close();
         } catch (IllegalStateException e) {
             Log.e(LOGTAG, "addSearchUrl", e);
             return;
