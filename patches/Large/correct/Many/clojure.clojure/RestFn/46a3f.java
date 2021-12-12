diff --git a/src/jvm/clojure/lang/RestFn.java b/src/jvm/clojure/lang/RestFn.java
index e33d21f..e87c77f 100644
--- a/src/jvm/clojure/lang/RestFn.java
+++ b/src/jvm/clojure/lang/RestFn.java
@@ -139,34 +139,34 @@
 	switch(reqArity)
 		{
 		case 0:
-			return invoke(args);
+			return doInvoke(args);
 		case 1:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, args.rest());
 		case 2:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, args.rest());
 		case 3:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, args.rest());
 		case 4:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, args.rest());
 		case 5:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, args.rest());
 		case 6:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -174,7 +174,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 7:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -183,7 +183,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 8:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -193,7 +193,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 9:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -204,7 +204,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 10:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -216,7 +216,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 11:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -229,7 +229,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 12:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -243,7 +243,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 13:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -258,7 +258,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 14:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -274,7 +274,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 15:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -291,7 +291,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 16:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -309,7 +309,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 17:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -328,7 +328,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 18:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -348,7 +348,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 19:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
@@ -369,7 +369,7 @@
 					, (args = args.rest()).first()
 					, args.rest());
 		case 20:
-			return invoke(args.first()
+			return doInvoke(args.first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
 					, (args = args.rest()).first()
