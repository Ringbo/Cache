diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/Timers.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/Timers.java
index beb80ec..7415d7a 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/Timers.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/Timers.java
@@ -41,18 +41,18 @@
    * @param timestamp the time at which the timer should be delivered
    * @param timeDomain the domain that the {@code timestamp} applies to
    */
-  public abstract void setTimer(Instant timestamp, TimeDomain timeDomain);
+  void setTimer(Instant timestamp, TimeDomain timeDomain);
 
   /** Removes the timer set in this context for the {@code timestmap} and {@code timeDomain}. */
-  public abstract void deleteTimer(Instant timestamp, TimeDomain timeDomain);
+  void deleteTimer(Instant timestamp, TimeDomain timeDomain);
 
   /** Returns the current processing time. */
-  public abstract Instant currentProcessingTime();
+  Instant currentProcessingTime();
 
   /** Returns the current synchronized processing time or {@code null} if unknown. */
   @Nullable
-  public abstract Instant currentSynchronizedProcessingTime();
+  Instant currentSynchronizedProcessingTime();
 
   /** Returns the current event time. */
-  public abstract Instant currentEventTime();
+  Instant currentEventTime();
 }
