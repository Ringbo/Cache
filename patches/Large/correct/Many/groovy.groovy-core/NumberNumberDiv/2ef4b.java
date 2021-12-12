diff --git a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberDiv.java b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberDiv.java
index ed2c152..2154c2f 100644
--- a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberDiv.java
+++ b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberDiv.java
@@ -98,7 +98,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Integer) receiver).doubleValue() / ((Float) arg).doubleValue());
                 }
             }
@@ -115,7 +115,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Integer) receiver).intValue() / ((Double) arg).doubleValue());
                 }
             }
@@ -132,7 +132,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Long) receiver).doubleValue() / ((Float) arg).doubleValue());
                 }
             }
@@ -149,7 +149,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Long) receiver).doubleValue() / ((Double) arg).doubleValue());
                 }
             }
@@ -166,7 +166,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() / ((Integer) arg).doubleValue());
                 }
             }
@@ -183,7 +183,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() / ((Long) arg).doubleValue());
                 }
             }
@@ -200,7 +200,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() / ((Float) arg).doubleValue());
                 }
             }
@@ -225,7 +225,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() / ((Double) arg).doubleValue());
                 }
             }
@@ -242,7 +242,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() / ((Integer) arg).doubleValue());
                 }
             }
@@ -267,7 +267,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() / ((Long) arg).doubleValue());
                 }
             }
@@ -284,7 +284,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() / ((Float) arg).doubleValue());
                 }
             }
@@ -301,7 +301,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() / ((Double) arg).doubleValue());
                 }
             }
