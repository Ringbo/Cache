diff --git a/hazelcast/src/main/java/com/hazelcast/util/PhoneHome.java b/hazelcast/src/main/java/com/hazelcast/util/PhoneHome.java
index eecb65c..70b688e 100644
--- a/hazelcast/src/main/java/com/hazelcast/util/PhoneHome.java
+++ b/hazelcast/src/main/java/com/hazelcast/util/PhoneHome.java
@@ -208,7 +208,7 @@
             conn.setConnectTimeout(TIMEOUT * 2);
             conn.setReadTimeout(TIMEOUT * 2);
             in = new BufferedInputStream(conn.getInputStream());
-        } catch (IOException ignored) {
+        } catch (Exception ignored) {
             ignore(ignored);
         } finally {
             closeResource(in);
