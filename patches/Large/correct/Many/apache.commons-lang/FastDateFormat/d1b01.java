diff --git a/src/java/org/apache/commons/lang/time/FastDateFormat.java b/src/java/org/apache/commons/lang/time/FastDateFormat.java
index bb9e301..d1cfedc 100644
--- a/src/java/org/apache/commons/lang/time/FastDateFormat.java
+++ b/src/java/org/apache/commons/lang/time/FastDateFormat.java
@@ -1,7 +1,7 @@
 /* ====================================================================
  * The Apache Software License, Version 1.1
  *
- * Copyright (c) 2002-2003 The Apache Software Foundation.  All rights
+ * Copyright (c) 2002-2004 The Apache Software Foundation.  All rights
  * reserved.
  *
  * Redistribution and use in source and binary forms, with or without
@@ -99,7 +99,7 @@
  * @author Stephen Colebourne
  * @author Nikolay Metchev
  * @since 2.0
- * @version $Id: FastDateFormat.java,v 1.17 2003/11/29 13:52:34 scolebourne Exp $
+ * @version $Id: FastDateFormat.java,v 1.18 2004/02/04 18:52:59 fredrik Exp $
  */
 public class FastDateFormat extends Format {
     // A lot of the speed in this class comes from caching, but some comes
@@ -307,7 +307,7 @@
         if (timeZone != null) {
             key = new Pair(key, timeZone);
         }
-        if (locale == null) {
+        if (locale != null) {
             key = new Pair(key, locale);
         }
 
