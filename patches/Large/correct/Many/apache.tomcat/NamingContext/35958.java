diff --git a/java/org/apache/naming/NamingContext.java b/java/org/apache/naming/NamingContext.java
index 57df34e..b71b92c 100644
--- a/java/org/apache/naming/NamingContext.java
+++ b/java/org/apache/naming/NamingContext.java
@@ -274,7 +274,7 @@
 
         if (entry == null) {
             throw new NameNotFoundException
-                (sm.getString("namingContext.nameNotBound", name.get(0)));
+                (sm.getString("namingContext.nameNotBound", name, name.get(0)));
         }
 
         if (name.size() > 1) {
@@ -369,7 +369,7 @@
 
         if (entry == null) {
             throw new NameNotFoundException
-                (sm.getString("namingContext.nameNotBound", name.get(0)));
+                (sm.getString("namingContext.nameNotBound", name, name.get(0)));
         }
 
         if (entry.type != NamingEntry.CONTEXT) {
@@ -423,7 +423,7 @@
 
         if (entry == null) {
             throw new NameNotFoundException
-                (sm.getString("namingContext.nameNotBound", name.get(0)));
+                (sm.getString("namingContext.nameNotBound", name, name.get(0)));
         }
 
         if (entry.type != NamingEntry.CONTEXT) {
@@ -492,7 +492,7 @@
 
         if (entry == null) {
             throw new NameNotFoundException
-                (sm.getString("namingContext.nameNotBound", name.get(0)));
+                (sm.getString("namingContext.nameNotBound", name, name.get(0)));
         }
 
         if (name.size() > 1) {
@@ -818,7 +818,7 @@
 
         if (entry == null) {
             throw new NameNotFoundException
-                (sm.getString("namingContext.nameNotBound", name.get(0)));
+                (sm.getString("namingContext.nameNotBound", name, name.get(0)));
         }
 
         if (name.size() > 1) {
@@ -897,8 +897,8 @@
 
         if (name.size() > 1) {
             if (entry == null) {
-                throw new NameNotFoundException
-                    (sm.getString("namingContext.nameNotBound", name.get(0)));
+                throw new NameNotFoundException(sm.getString(
+                        "namingContext.nameNotBound", name, name.get(0)));
             }
             if (entry.type == NamingEntry.CONTEXT) {
                 if (rebind) {
