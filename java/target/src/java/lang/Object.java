/*
   Copyright 2011 Martin Schoeberl <masca@imm.dtu.dk>,
                  Technical University of Denmark, DTU Informatics. 
   All rights reserved.

   Redistribution and use in source and binary forms, with or without
   modification, are permitted provided that the following conditions are met:

      1. Redistributions of source code must retain the above copyright notice,
         this list of conditions and the following disclaimer.

      2. Redistributions in binary form must reproduce the above copyright
         notice, this list of conditions and the following disclaimer in the
         documentation and/or other materials provided with the distribution.

   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER ``AS IS'' AND ANY EXPRESS
   OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
   OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
   NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
   DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
   (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
   ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
   THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

   The views and conclusions contained in the software and documentation are
   those of the authors and should not be interpreted as representing official
   policies, either expressed or implied, of the copyright holder.
 */

package java.lang;

// import com.muvium.leros.Native;

/**
 * Part of the VERY minimalistic Leros/muvium JDK
 * 
 * @author Martin Schoeberl
 * 
 */
public class Object {

	public Object() {
	}

	public boolean equals(Object o) {
		return this == o;
	}

	public int hashCode() {
		// MS: we should just use the address as default implementation
		// return Native.toInt(this);
		return 0;
	}


	public String toString() {
		// return "Object " + hashCode();
		// no strings yet
		return null;
	}

	/*
	 * protected void finalize() throws Throwable { }
	 */


//	protected Object clone() throws CloneNotSupportedException {
//		throw new CloneNotSupportedException("Object not cloneable");
//	}
	
	protected Object clone() {
		return null;
	}

//	public final Class getClass() {
//		throw new Error("getClass() NYI");
//	}

//	public final void notify() throws IllegalMonitorStateException {
//		; // fake
//	}
//
//
//	public final void notifyAll() throws IllegalMonitorStateException {
//		; // fake
//	}
//
//
//	public final void wait() throws IllegalMonitorStateException,
//			InterruptedException {
//		; // fake
//	}

	/*
	 * public final void wait(long ms) throws IllegalMonitorStateException,
	 * InterruptedException { wait(ms, 0); }
	 */

}
