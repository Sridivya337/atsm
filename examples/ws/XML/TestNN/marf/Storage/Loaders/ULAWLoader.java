package marf.Storage.Loaders;

import java.io.File;

import marf.Storage.Sample;
import marf.Storage.StorageException;
import marf.util.NotImplementedException;


/**
 * TODO: Not Implemented.
 * @author Serguei Mokhov
 * @version $Revision: 1.16 $
 * @since 0.0.1
 */
public class ULAWLoader
extends AudioSampleLoader
{
	/**
	 * ULAWLoader Constructor.
	 */
	public ULAWLoader()
	{
	}

	/**
	 * Not Implemented.
	 * @see marf.Storage.ISampleLoader#loadSample(java.io.File)
	 */
	public Sample loadSample(File poFile)
	throws StorageException
	{
		throw new NotImplementedException("ULAWLoader.loadSample()");
	}

	/**
	 * Not Implemented.
	 * @see marf.Storage.ISampleLoader#readSampleData(double[])
	 */
	public final int readSampleData(double[] padSample)
	throws StorageException
	{
		throw new NotImplementedException("ULAWLoader.readAudioData()");
	}

	/**
	 * Not Implemented.
	 * @see marf.Storage.ISampleLoader#writeSampleData(double[], int)
	 */
	public final int writeSampleData(final double[] padSample, final int piNbrData)
	throws StorageException
	{
		throw new NotImplementedException("ULAWLoader.writeAudioData()");
	}

	/**
	 * Not Implemented.
	 * @see marf.Storage.ISampleLoader#saveSample(java.io.File)
	 */
	public void saveSample(File poFile)
	throws StorageException
	{
		throw new NotImplementedException("ULAWLoader.saveSample()");
	}

	/**
	 * Returns source code revision information.
	 * @return revision string
	 * @since 0.3.0.2
	 */
	public static String getMARFSourceCodeRevision()
	{
		return "$Revision: 1.16 $";
	}
}

// EOF
