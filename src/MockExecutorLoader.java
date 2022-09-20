public class MockExecutorLoader implements ExecutorLoader {
	public void unassignExecutor(int executionId) throws ExecutorManagerException {
		executionExecutorMapping.remove(executionId);
	}
	
	@Override
	public List<ExecutableFlow> fetchRecentlyFinishedFlows(long lifeTimeMs)	throws ExecutorManagerException {
		return null;
	}
}