diff --git a/JodaTime/src/java/org/joda/time/AbstractDuration.java b/JodaTime/src/java/org/joda/time/AbstractDuration.java
index 606a034..24ec0d5 100644
--- a/JodaTime/src/java/org/joda/time/AbstractDuration.java
+++ b/JodaTime/src/java/org/joda/time/AbstractDuration.java
@@ -355,7 +355,8 @@
 
     //-----------------------------------------------------------------------
     /**
-     * Adds this duration to the given instant, returning a new value.
+     * Adds this duration to the given instant using the chronology of the duration
+     * which typically ignores time zones.
      * <p>
      * To add just once, pass in a scalar of one. To subtract once, pass
      * in a scalar of minus one.
@@ -371,7 +372,7 @@
     }
 
     /**
-     * Adds this duration to the given instant, returning a new value.
+     * Adds this duration to the given instant using a specific chronology.
      * <p>
      * To add just once, pass in a scalar of one. To subtract once, pass
      * in a scalar of minus one.
@@ -452,7 +453,8 @@
     }
 
     /**
-     * Adds this duration to the given instant, returning a new Instant.
+     * Adds this duration to the given instant using the chronology of the specified
+     * instant (if present), returning a new Instant.
      * <p>
      * To add just once, pass in a scalar of one. To subtract once, pass
      * in a scalar of minus one.
@@ -466,11 +468,12 @@
         if (instant == null) {
             return new Instant(addTo(DateTimeUtils.currentTimeMillis(), scalar));
         }
-        return new Instant(addTo(instant.getMillis(), scalar));
+        return new Instant(addTo(instant.getMillis(), scalar, instant.getChronology()));
     }
 
     /**
-     * Adds this duration into the given mutable instant.
+     * Adds this duration into the given mutable instant using the chronology of
+     * the specified mutable instant (if present).
      * <p>
      * To add just once, pass in a scalar of one. To subtract once, pass
      * in a scalar of minus one.
@@ -484,7 +487,7 @@
         if (instant == null) {
             throw new IllegalArgumentException("The instant must not be null");
         }
-        instant.setMillis(addTo(instant.getMillis(), scalar));
+        instant.setMillis(addTo(instant.getMillis(), scalar, instant.getChronology()));
     }
 
     //-----------------------------------------------------------------------
