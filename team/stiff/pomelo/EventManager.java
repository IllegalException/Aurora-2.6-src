//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\XeonLyfeGPC\Desktop\1.12 stable mappings"!

//Decompiled by Procyon!

package team.stiff.pomelo;

public interface EventManager
{
     <E> E dispatchEvent(final E p0);
    
    boolean isRegisteredListener(final Object p0);
    
    boolean addEventListener(final Object p0);
    
    boolean removeEventListener(final Object p0);
}
