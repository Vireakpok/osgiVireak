package com.khalibre.training.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author vireakp
 */
public class ActivatorClassActivator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Server");
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Server");
	}

}