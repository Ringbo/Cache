diff --git a/subprojects/logging/src/main/java/org/gradle/internal/logging/serializer/LogEventSerializer.java b/subprojects/logging/src/main/java/org/gradle/internal/logging/serializer/LogEventSerializer.java
index 1eaa6ef..f47a38f 100644
--- a/subprojects/logging/src/main/java/org/gradle/internal/logging/serializer/LogEventSerializer.java
+++ b/subprojects/logging/src/main/java/org/gradle/internal/logging/serializer/LogEventSerializer.java
@@ -37,7 +37,7 @@
         encoder.writeLong(event.getTimestamp());
         encoder.writeString(event.getCategory());
         logLevelSerializer.write(encoder, event.getLogLevel());
-        encoder.writeString(event.getMessage());
+        encoder.writeNullableString(event.getMessage());
         throwableSerializer.write(encoder, event.getThrowable());
         if (event.getBuildOperationId() == null) {
             encoder.writeBoolean(false);
@@ -52,7 +52,7 @@
         long timestamp = decoder.readLong();
         String category = decoder.readString();
         LogLevel logLevel = logLevelSerializer.read(decoder);
-        String message = decoder.readString();
+        String message = decoder.readNullableString();
         Throwable throwable = throwableSerializer.read(decoder);
         OperationIdentifier buildOperationId = decoder.readBoolean() ? new OperationIdentifier(decoder.readSmallLong()) : null;
         return new LogEvent(timestamp, category, logLevel, message, throwable, buildOperationId);
