import java.util.*;

public class Network {
    private List<Antenna> antennas;

    public Network() {
        this.antennas = new ArrayList<>();
    }

    public boolean addAntenna(Antenna newAntenna) {
        if (antennas.isEmpty()) {
            antennas.add(newAntenna);
            return true;
        }

        boolean hasOverlap = false;
        for (Antenna existing : antennas) {
            double distance = Math.sqrt(
                Math.pow(existing.getX() - newAntenna.getX(), 2) +
                Math.pow(existing.getY() - newAntenna.getY(), 2)
            );
            double combinedRadius = existing.getCoverageRadius() + newAntenna.getCoverageRadius();
            if (distance <= combinedRadius) {
                hasOverlap = true;
                break;
            }
        }

        if (hasOverlap) {
            antennas.add(newAntenna);
            return true;
        }
        return false;
    }

    public Antenna findNearestAntenna(double phoneX, double phoneY) {
        Antenna nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Antenna antenna : antennas) {
            if (antenna.isInRange(phoneX, phoneY) && antenna.canAcceptNewCall()) {
                double distance = Math.sqrt(
                    Math.pow(antenna.getX() - phoneX, 2) +
                    Math.pow(antenna.getY() - phoneY, 2)
                );
                if (distance < minDistance) {
                    minDistance = distance;
                    nearest = antenna;
                }
            }
        }

        return nearest;
    }

    public List<Antenna> getAntennas() {
        return antennas;
    }
}