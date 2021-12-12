diff --git a/platforms/spring-boot/components-starter/camel-yammer-starter/src/main/java/org/apache/camel/component/yammer/springboot/YammerComponentConfiguration.java b/platforms/spring-boot/components-starter/camel-yammer-starter/src/main/java/org/apache/camel/component/yammer/springboot/YammerComponentConfiguration.java
index eb87919..8696130 100644
--- a/platforms/spring-boot/components-starter/camel-yammer-starter/src/main/java/org/apache/camel/component/yammer/springboot/YammerComponentConfiguration.java
+++ b/platforms/spring-boot/components-starter/camel-yammer-starter/src/main/java/org/apache/camel/component/yammer/springboot/YammerComponentConfiguration.java
@@ -151,7 +151,7 @@
          * you could append "?olderThan=2912″ to your request to get the 20
          * messages prior to those you're seeing.
          */
-        private Integer olderThan = -1;
+        private Long olderThan = -1L;
         /**
          * Returns messages newer than the message ID specified as a numeric
          * string. This should be used when polling for new messages. If you're
@@ -160,7 +160,7 @@
          * that you do not get duplicate copies of messages already on your
          * page.
          */
-        private Integer newerThan = -1;
+        private Long newerThan = -1L;
         /**
          * threaded=true will only return the first message in each thread. This
          * parameter is intended for apps which display message threads
@@ -247,19 +247,19 @@
             this.limit = limit;
         }
 
-        public Integer getOlderThan() {
+        public Long getOlderThan() {
             return olderThan;
         }
 
-        public void setOlderThan(Integer olderThan) {
+        public void setOlderThan(Long olderThan) {
             this.olderThan = olderThan;
         }
 
-        public Integer getNewerThan() {
+        public Long getNewerThan() {
             return newerThan;
         }
 
-        public void setNewerThan(Integer newerThan) {
+        public void setNewerThan(Long newerThan) {
             this.newerThan = newerThan;
         }
 
