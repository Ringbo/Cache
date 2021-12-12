diff --git a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMultiply.java b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMultiply.java
index 8466500..39b35af 100644
--- a/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMultiply.java
+++ b/src/main/org/codehaus/groovy/runtime/dgmimpl/NumberNumberMultiply.java
@@ -109,7 +109,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() * ((Double) arg).doubleValue());
                 }
             }
@@ -126,7 +126,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() * ((Float) arg).doubleValue());
                 }
             }
@@ -143,7 +143,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() * ((Long) arg).doubleValue());
                 }
             }
@@ -160,7 +160,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Double) receiver).doubleValue() * ((Integer) arg).intValue());
                 }
             }
@@ -177,7 +177,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() * ((Double) arg).doubleValue());
                 }
             }
@@ -194,7 +194,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() * ((Float) arg).doubleValue());
                 }
             }
@@ -211,7 +211,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() * ((Long) arg).doubleValue());
                 }
             }
@@ -228,7 +228,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Float) receiver).doubleValue() * ((Integer) arg).doubleValue());
                 }
             }
@@ -245,7 +245,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Long) receiver).doubleValue() * ((Double) arg).doubleValue());
                 }
             }
@@ -262,7 +262,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Long) receiver).doubleValue() * ((Float) arg).doubleValue());
                 }
             }
@@ -279,7 +279,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Long(((Long) receiver).longValue() * ((Long) arg).longValue());
                 }
             }
@@ -296,7 +296,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Long(((Long) receiver).longValue() * ((Integer) arg).longValue());
                 }
             }
@@ -313,7 +313,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Integer) receiver).doubleValue() * ((Double) arg).doubleValue());
                 }
             }
@@ -330,7 +330,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Double(((Integer) receiver).doubleValue() * ((Float) arg).doubleValue());
                 }
             }
@@ -347,7 +347,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                     return new Long(((Integer) receiver).longValue() * ((Long) arg).longValue());
                 }
             }
@@ -364,7 +364,7 @@
 
         public final Object call(Object receiver, Object arg) throws Throwable {
             try {
-                if (checkPojoMetaClass()) {
+                if (checkCall(receiver)) {
                   return new Integer(((Integer) receiver).intValue() * ((Integer) arg).intValue());
                 }
             }
