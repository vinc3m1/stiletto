package stiletto

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

interface SingletonHolder {
  val singletonMap: ConcurrentMap<String, Any>

  final inline fun <reified T : Any> singleton(tag: String = "",
      initializer: () -> T): T {
    return singletonMap.putIfAbsent("${javaClass<T>().getName()}.${tag} ", initializer()) as T
  }
}

public interface Module : SingletonHolder {}

public abstract class Component : SingletonHolder {
  override val singletonMap = ConcurrentHashMap<String, Any>()
}