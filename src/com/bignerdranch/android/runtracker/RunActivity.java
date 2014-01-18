package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

public class RunActivity extends SingleFragmentActivity {
	//A key for passing a run ID as a long
	public static final String EXTRA_RUN_ID = 
			"com.bignerdranch.android.runtracker.run_id";
	
	@Override
	protected Fragment createFragment() {
		long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
		if (runId != -1) {
			return new RunFragment().newInstance(runId);
		} else {
			return new RunFragment();
		}
	}
}
