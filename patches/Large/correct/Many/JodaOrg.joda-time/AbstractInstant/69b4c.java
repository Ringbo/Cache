diff --git a/JodaTime/src/java/org/joda/time/base/AbstractInstant.java b/JodaTime/src/java/org/joda/time/base/AbstractInstant.java
index 06e0247..5e9b016 100644
--- a/JodaTime/src/java/org/joda/time/base/AbstractInstant.java
+++ b/JodaTime/src/java/org/joda/time/base/AbstractInstant.java
@@ -136,21 +136,21 @@
     }
 
     /**
-     * Get this object as a DateTime.
+     * Get this object as a DateTime, in the same zone.
      * 
      * @return a DateTime using the same millis
      */
     public DateTime toDateTime() {
-        return new DateTime(getMillis());
+        return new DateTime(getMillis(), getZone());
     }
 
     /**
-     * Get this object as a DateTime using ISOChronology in the default zone.
+     * Get this object as a DateTime using ISOChronology, in the same zone.
      * 
-     * @return a DateTime using the same millis with ISOChronology in the default zone.
+     * @return a DateTime using the same millis with ISOChronology
      */
     public DateTime toDateTimeISO() {
-        return new DateTime(getMillis(), ISOChronology.getInstance());
+        return new DateTime(getMillis(), ISOChronology.getInstance(getZone()));
     }
 
     /**
@@ -166,7 +166,7 @@
     }
 
     /**
-     * Get this object as a DateTime.
+     * Get this object as a DateTime using the given chronology and its zone.
      * 
      * @param chronology chronology to apply, or ISOChronology if null
      * @return a DateTime using the same millis
@@ -181,21 +181,21 @@
     // returning a copy prevents this.
 
     /**
-     * Get this object as a MutableDateTime.
+     * Get this object as a MutableDateTime, in the same zone.
      * 
      * @return a MutableDateTime using the same millis
      */
     public MutableDateTime toMutableDateTime() {
-        return new MutableDateTime(getMillis());
+        return new MutableDateTime(getMillis(), getZone());
     }
 
     /**
-     * Get this object as a MutableDateTime using ISOChronology in the default zone.
+     * Get this object as a MutableDateTime using ISOChronology, in the same zone.
      * 
-     * @return a MutableDateTime using the same millis with ISOChronology in the default zone.
+     * @return a MutableDateTime using the same millis with ISOChronology
      */
     public MutableDateTime toMutableDateTimeISO() {
-        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
+        return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone()));
     }
 
     /**
@@ -211,7 +211,7 @@
     }
 
     /**
-     * Get this object as a MutableDateTime.
+     * Get this object as a MutableDateTime using the given chronology and its zone.
      * 
      * @param chronology chronology to apply, or ISOChronology if null
      * @return a MutableDateTime using the same millis
