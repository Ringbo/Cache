diff --git a/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/TFAgentStatBatchMapper.java b/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/TFAgentStatBatchMapper.java
index d8b78d1..da7f421 100644
--- a/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/TFAgentStatBatchMapper.java
+++ b/collector/src/main/java/com/navercorp/pinpoint/collector/mapper/thrift/stat/TFAgentStatBatchMapper.java
@@ -29,11 +29,11 @@
  */
 public class TFAgentStatBatchMapper {
     private final Logger logger = LoggerFactory.getLogger(this.getClass());
-    public final TFAgentStatMappter tFAgentStatMappter = new TFAgentStatMappter();
+    public final TFAgentStatMapper tFAgentStatMapper = new TFAgentStatMapper();
 
     public TFAgentStatBatch map(AgentStatBo agentStatBo) {
         try {
-            List<TFAgentStat> tFAgentstatList = tFAgentStatMappter.map(agentStatBo);
+            List<TFAgentStat> tFAgentstatList = tFAgentStatMapper.map(agentStatBo);
             long startTimestamp = getStartTimestamp(agentStatBo);
             TFAgentStatBatch tFAgentStatBatch = new TFAgentStatBatch(agentStatBo.getAgentId(), startTimestamp, tFAgentstatList);
             return tFAgentStatBatch;
