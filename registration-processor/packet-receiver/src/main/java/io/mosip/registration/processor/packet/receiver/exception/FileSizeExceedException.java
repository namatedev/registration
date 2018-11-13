package io.mosip.registration.processor.packet.receiver.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;

import io.mosip.registration.processor.packet.receiver.exception.utils.IISPlatformErrorCodes;

/**
 * FileSizeExceedException occurs when uploaded file size is more than specified
 * size.
 *
 */
public class FileSizeExceedException extends BaseUncheckedException {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new file size exceed exception.
	 */
	public FileSizeExceedException() {
		super();
	}

	/**
	 * Instantiates a new file size exceed exception.
	 *
	 * @param message the message
	 */
	public FileSizeExceedException(String message) {
		super(IISPlatformErrorCodes.IIS_EPU_ATU_FILE_SIZE_EXCEED, message);
	}

	/**
	 * Instantiates a new file size exceed exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public FileSizeExceedException(String message, Throwable cause) {
		super(IISPlatformErrorCodes.IIS_EPU_ATU_FILE_SIZE_EXCEED + EMPTY_SPACE, message, cause);
	}
}
